package com.azarius.command;

import java.util.Collections;
import java.util.List;

import com.azarius.api.profession.Profession;
import com.azarius.init.CapabilityInit;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class CommandSetXP implements ICommand{

	World world;
	Entity player;
	int exp;
	Profession profession;
	
	@Override
	public int compareTo(ICommand o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "setXP";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Sets XP";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return Collections.singletonList("setxp");
	}
	
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		world = sender.getEntityWorld();
		String tag = null;
		String role = "UNSET";
		
		
		/*if (!world.isRemote) {}else&*/ 
			if (args.length != 2) {
				sender.sendMessage(new TextComponentString("Invalid Number of Arguments"));
				return;
			}
			
			player = sender.getCommandSenderEntity();
			tag = args[0];
			exp =  Integer.parseInt(args[1]);
			
			if(tag.equalsIgnoreCase("WV") || tag.equalsIgnoreCase("CL") || tag.equalsIgnoreCase("BS") || tag.equalsIgnoreCase("AS") || tag.equalsIgnoreCase("LH") || tag.equalsIgnoreCase("CA") ||(tag.equalsIgnoreCase("AL"))) {
				if(exp >= 0) {
					System.out.println("ABOUT TO PROCESS");
					player.getCapability(CapabilityInit.CAPABILITY_PROFESSION, EnumFacing.DOWN).setXP(exp, tag);
					System.out.print("PROCESSED COMMAND");
					if(args[0].equalsIgnoreCase("WV")) {
						role = "Weaving";
					}if (args[0].equalsIgnoreCase("CL")) {
						role = "Culinary";
					}if (args[0].equalsIgnoreCase("BS")) {
						role = "BlackSmithing";
					}if (args[0].equalsIgnoreCase("AS")) {
						role = "ArmorSmithing";
					}if (args[0].equalsIgnoreCase("LH")) {
						role = "Leatherworking";
					}if (args[0].equalsIgnoreCase("CA")) {
						role = "Carpentry";
					}
					sender.sendMessage(new TextComponentString("Your XP for " + role + " was set to " + exp));
				}else {
					sender.sendMessage(new TextComponentString("Invalid Quantity of Experience. MUST be >= 0"));
				}
			}else {
				sender.sendMessage(new TextComponentString("Invalid Profession Tag"));
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
