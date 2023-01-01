package net.hexnowloading.dungeonnowloading;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(DungeonNowLoadingMod.MODID)
@Mod.EventBusSubscriber(modid = DungeonNowLoadingMod.MODID)
public class DungeonNowLoadingMod {
    public static final String MODID = "dungeonnowloadingmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DungeonNowLoadingMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
