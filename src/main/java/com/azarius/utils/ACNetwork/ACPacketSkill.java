package com.azarius.utils.ACNetwork;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ACPacketSkill implements IMessage{

	
	private boolean messageValid;
	
	public ACPacketSkill() {
		this.messageValid = false;
	}
	
	
	@Override
	public void fromBytes(ByteBuf buf) {
		try {
			
		} catch (IndexOutOfBoundsException ioe) {
			
		}
		
	}

	@Override
	public void toBytes(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}
	
}
