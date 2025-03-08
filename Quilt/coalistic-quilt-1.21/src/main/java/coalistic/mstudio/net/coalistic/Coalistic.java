package coalistic.mstudio.net.coalistic;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coalistic implements ModInitializer {
	public static final String MODID = "coalistic";
    public static final Logger LOGGER = LoggerFactory.getLogger(Coalistic.MODID);

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}
