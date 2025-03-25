package qorve.gemstones.particles;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.thread.TaskQueue;
import qorve.gemstones.Gemstones;

import static qorve.gemstones.Gemstones.MOD_ID;

public class ModParticles {

    public static final SimpleParticleType SCISSORS_SWING_PARTICLE =
            registerParticle("scissors_swing_particle",FabricParticleTypes.simple(true));

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType){
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, name), particleType);
    }

        public static void registerModParticles(){
            Gemstones.LOGGER.info("Registering Mod Particles for " + MOD_ID);
        }
    }
