package ch.cqa.uselesstools.usefultools;

import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import org.lwjgl.opengl.GL11;

import java.util.OptionalDouble;


public final class RenderTypeHelper {
  public static final RenderState.TransparencyState TRANSLUCENT_TRANSPARENCY;
  public static final RenderState.TransparencyState NO_TRANSPARENCY;
  public static final RenderState.TransparencyState LIGHTNING_TRANSPARENCY;

  public static final RenderState.LayerState VIEW_OFFSET_Z_LAYERING;

  public static final RenderState.TargetState ITEM_ENTITY_TARGET;

  public static final RenderType MBE_LINE_DEPTH_WRITING_ON;
  public static final RenderType MBE_LINE_NO_DEPTH_TEST;

  public static final RenderType MBE_TRIANGLES_NO_TEXTURE;

  static {
    LIGHTNING_TRANSPARENCY = ObfuscationReflectionHelper.getPrivateValue(RenderState.class, null, "field_228512_d_");
    TRANSLUCENT_TRANSPARENCY = ObfuscationReflectionHelper.getPrivateValue(RenderState.class, null, "field_228515_g_");
    NO_TRANSPARENCY = ObfuscationReflectionHelper.getPrivateValue(RenderState.class, null, "field_228510_b_");

    VIEW_OFFSET_Z_LAYERING = ObfuscationReflectionHelper.getPrivateValue(RenderState.class, null, "field_239235_M_");

    ITEM_ENTITY_TARGET = ObfuscationReflectionHelper.getPrivateValue(RenderState.class, null, "field_241712_U_");

    final boolean ENABLE_DEPTH_WRITING = true;
    final boolean ENABLE_COLOUR_COMPONENTS_WRITING = true;
    final RenderState.WriteMaskState WRITE_TO_DEPTH_AND_COLOR
            = new RenderState.WriteMaskState(ENABLE_DEPTH_WRITING, ENABLE_COLOUR_COMPONENTS_WRITING);

    final RenderState.DepthTestState NO_DEPTH_TEST = new RenderState.DepthTestState("always",GL11.GL_ALWAYS);

    final int INITIAL_BUFFER_SIZE = 128;
    final boolean AFFECTS_OUTLINE = false;
    RenderType.State renderState;
    renderState = RenderType.State.getBuilder()
            .line(new RenderState.LineState(OptionalDouble.of(1)))
            .layer(VIEW_OFFSET_Z_LAYERING)
            .transparency(NO_TRANSPARENCY)
            .target(ITEM_ENTITY_TARGET)
            .writeMask(WRITE_TO_DEPTH_AND_COLOR)
            .build(AFFECTS_OUTLINE);
    MBE_LINE_DEPTH_WRITING_ON = RenderType.makeType("mbe_line_1_depth_writing_on",
            DefaultVertexFormats.POSITION_COLOR, GL11.GL_LINES, INITIAL_BUFFER_SIZE, renderState);

    renderState = RenderType.State.getBuilder()
            .line(new RenderState.LineState(OptionalDouble.of(1)))
            .layer(VIEW_OFFSET_Z_LAYERING)
            .transparency(NO_TRANSPARENCY)
            .target(ITEM_ENTITY_TARGET)
            .writeMask(WRITE_TO_DEPTH_AND_COLOR)
            .depthTest(NO_DEPTH_TEST)
            .build(AFFECTS_OUTLINE);
    MBE_LINE_NO_DEPTH_TEST = RenderType.makeType("mbe_line_1_no_depth_test",
            DefaultVertexFormats.POSITION_COLOR, GL11.GL_LINES, INITIAL_BUFFER_SIZE, renderState);

    renderState = RenderType.State.getBuilder()
            .layer(VIEW_OFFSET_Z_LAYERING)
            .transparency(NO_TRANSPARENCY)
            .target(ITEM_ENTITY_TARGET)
            .writeMask(WRITE_TO_DEPTH_AND_COLOR)
            .build(AFFECTS_OUTLINE);
    MBE_TRIANGLES_NO_TEXTURE = RenderType.makeType("mbe_triangles_no_texture",
            DefaultVertexFormats.POSITION_COLOR, GL11.GL_TRIANGLES, INITIAL_BUFFER_SIZE, renderState);
  }

}