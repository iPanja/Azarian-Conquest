package com.azarius.command;

import java.util.Collections;
import java.util.List;

import com.azarius.utils.data.ACProfessions;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class CommandGetMana implements ICommand{

	@Override
	public int compareTo(ICommand o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "getMana";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "mana";
	}

	@Override
	public List<String> getAliases() {
		// TODO Auto-generated method stub
		return Collections.singletonList("gmana");
	}
	World world;
	int mana = 0;
	ACProfessions professions;
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
			if(sender.getCommandSenderEntity().hasCapability(ACProfessions.CAPABILITY_MANA, EnumFacing.DOWN)) {
				System.out.println("YOU ARE A WIZARD");
				ACProfessions.getHandler(sender.getCommandSenderEntity()).getMana();
				System.out.println(ACProfessions.getHandler(sender.getCommandSenderEntity()).getMana());
				sender.sendMessage(new TextComponentString("You have " + ACProfessions.getHandler(sender.getCommandSenderEntity()).getMana() + " mana"));
			}
			//mana = Integer.parseInt(args[0]);

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
