// automatically generated by the FlatBuffers compiler, do not modify

package MyGame.Example;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
@javax.annotation.Generated(value="flatc")
final class TestSimpleTableWithEnum extends Table {
  public static TestSimpleTableWithEnum getRootAsTestSimpleTableWithEnum(ByteBuffer _bb) { return getRootAsTestSimpleTableWithEnum(_bb, new TestSimpleTableWithEnum()); }
  public static TestSimpleTableWithEnum getRootAsTestSimpleTableWithEnum(ByteBuffer _bb, TestSimpleTableWithEnum obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public TestSimpleTableWithEnum __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte color() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 2; }
  public boolean mutateColor(byte color) { int o = __offset(4); if (o != 0) { bb.put(o + bb_pos, color); return true; } else { return false; } }

  public static int createTestSimpleTableWithEnum(FlatBufferBuilder builder,
      byte color) {
    builder.startObject(1);
    TestSimpleTableWithEnum.addColor(builder, color);
    return TestSimpleTableWithEnum.endTestSimpleTableWithEnum(builder);
  }

  public static void startTestSimpleTableWithEnum(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addColor(FlatBufferBuilder builder, byte color) { builder.addByte(0, color, 2); }
  public static int endTestSimpleTableWithEnum(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
