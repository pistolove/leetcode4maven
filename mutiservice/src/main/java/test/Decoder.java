package test;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

/**
 * 反序列化
 * @author liqqc
 *
 */
public class Decoder extends ByteToMessageDecoder{

    public Decoder(Class<Request> request) {
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        // TODO Auto-generated method stub
        
    }


}
