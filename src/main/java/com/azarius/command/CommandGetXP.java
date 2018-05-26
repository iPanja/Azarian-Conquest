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
import net.minecraft.world.World;

public class CommandGetXP implements ICommand {

	World world;
	Entity player;
	CapabilityInit cap;
	int exp;
	
	@Override
	public int compareTo(ICommand o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "getXP";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "gets xp";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return Collections.singletonList("gxp");
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		world = sender.getEntityWorld();
		String tag = "UNSET";
		if (world.isRemote) {}else {
			if (args.length != 1) {
				sender.sendMessage(new TextComponentString("Invalid Number of Arguments"));
				return;
			}
			
			
			if (args[0].equalsIgnoreCase("WV") || args[0].equalsIgnoreCase("CL") || args[0].equalsIgnoreCase("BS") || args[0].equalsIgnoreCase("AS") || args[0].equalsIgnoreCase("LH") || args[0].equalsIgnoreCase("CA") ||(args[0].equalsIgnoreCase("AL"))) {
			
			player = sender.getCommandSenderEntity();
			exp = CapabilityInit.getHandler(player).getXP(args[0]);
			
			if(args[0].equalsIgnoreCase("WV")) {
				tag = "Weaving";
			}if (args[0].equalsIgnoreCase("CL")) {
				tag = "Culinary";
			}if (args[0].equalsIgnoreCase("BS")) {
				tag = "BlackSmithing";
			}if (args[0].equalsIgnoreCase("AS")) {
				tag = "ArmorSmithing";
			}if (args[0].equalsIgnoreCase("LH")) {
				tag = "Leatherworking";
			}if (args[0].equalsIgnoreCase("CA")) {
				tag = "Carpentry";
			}
			
			
			sender.sendMessage(new TextComponentString("Your current " + tag + " EXP is " + exp));
			}
		}
		
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
