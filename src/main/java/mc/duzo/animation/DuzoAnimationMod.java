package mc.duzo.animation;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DuzoAnimationMod implements ModInitializer {
    public static final String MOD_ID = "animation";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("thank you for using duzos animator!");
    }
}