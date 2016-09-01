package test;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * 序列化
 * @author liqqc
 *
 */
public class Encoder extends MessageToByteEncoder{

    public Encoder(Class<Response> class1) {
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        // TODO Auto-generated method stub
        
    }

}
