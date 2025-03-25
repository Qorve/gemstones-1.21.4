package qorve.gemstones;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import qorve.gemstones.particles.ModParticles;
import qorve.gemstones.particles.ScissorsSwingParticle;

public class GemstonesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.SCISSORS_SWING_PARTICLE, ScissorsSwingParticle.Factory::new);
    }
}
