package ch.cqa.uselesstools.usefultools.debugging;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DebugSpawnInhibitor {
  @SubscribeEvent
  public static void checkForSpawnDenial(LivingSpawnEvent.CheckSpawn event) {
    if (DebugSettings.getDebugParameter("preventspawning").isPresent()) {
      ResourceLocation entityname = ForgeRegistries.ENTITIES.getKey(event.getEntity().getType());
      if (entityname.getNamespace().equals("minecraft")) {
        event.setResult(Event.Result.DENY);
      } else {
        event.setResult(Event.Result.DEFAULT);
      }
    } else {
      event.setResult(Event.Result.DEFAULT);
    }
  }
}
