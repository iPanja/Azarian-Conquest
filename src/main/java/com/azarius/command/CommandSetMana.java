package com.azarius.command;

import java.util.Collections;
import java.util.List;

import com.azarius.utils.data.ACProfessions;
import com.azarius.utils.data.ACProfessions.DefaultManaHandler;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class CommandSetMana implements ICommand{

	@Override
	public int compareTo(ICommand o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "setMana";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "smana";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return Collections.singletonList("smana");
	}
	World world;
	int mana = 0;
	ACProfessions professions;
	DefaultManaHandler handler;
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
	/*	if (world.isRemote) {}else {
			if (args.length != 1) {
				sender.sendMessage(new TextComponentString("Invalid Number of Arguments"));
				return;
			}*/
			mana = Integer.parseInt(args[0]);
			
			if(sender.getCommandSenderEntity().hasCapability(ACProfessions.CAPABILITY_MANA, EnumFacing.DOWN)) {
				System.out.println("YOU ARE A WIZARD");
				sender.getCommandSenderEntity().getCapability(ACProfessions.CAPABILITY_MANA, EnumFacing.DOWN).setMana(mana);
				
				System.out.println(mana);
				sender.sendMessage(new TextComponentString("You have " + ACProfessions.getHandler(sender.getCommandSenderEntity()).getMana() + " mana"));
			}
			
		}
	//}

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
