package com.azarius.command;

import java.util.Collections;
import java.util.List;

import com.azarius.init.CapabilityInit;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

public class CommandGetLevel implements ICommand{

	@Override
	public int compareTo(ICommand o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "getLevel";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "gets level";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return Collections.singletonList("gl");
	}
	Entity player;
	String tag;
	int exp;
	int level;
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		if (args.length != 1) {
			sender.sendMessage(new TextComponentString("Invalid Number of Arguments"));
			return;
		}
		
		player = sender.getCommandSenderEntity();
		tag = args[0];
		String role = null;
		
		exp = CapabilityInit.getHandler(player).getXP(tag);
		player.sendMessage(new TextComponentString("" + exp));
		
		level = CapabilityInit.getHandler(player).getProfessionLevel(tag, exp);
		player.sendMessage(new TextComponentString("" + level));
		
		if(tag.equalsIgnoreCase("WV")) {
			role = " Weaver";
		}if (tag.equalsIgnoreCase("CL")) {
			role = " Culinarian";
		}if (tag.equalsIgnoreCase("BS")) {
			role = " BlackSmith";
		}if (tag.equalsIgnoreCase("AS")) {
			role = " ArmorSmith";
		}if (tag.equalsIgnoreCase("LH")) {
			role = " Leatherworker";
		}if (tag.equalsIgnoreCase("CA")) {
			role = " Carpenter";
		}
		
		player.sendMessage(new TextComponentString(TextFormatting.GRAY + "You are a level " + TextFormatting.GOLD + TextFormatting.BOLD + level + TextFormatting.RESET + TextFormatting.GRAY + role));
		

		
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args,
			BlockPos targetPos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		// TODO Auto-generated method stub
		return false;
	}

}
