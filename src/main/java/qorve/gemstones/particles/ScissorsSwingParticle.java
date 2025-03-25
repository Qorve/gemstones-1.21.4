package qorve.gemstones.particles;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class ScissorsSwingParticle extends SpriteBillboardParticle {
    public ScissorsSwingParticle(ClientWorld clientWorld, double x, double y, double z,
                                 SpriteProvider spriteProvider, double xVel, double yVel, double zVel) {
        super(clientWorld, x, y, z, xVel, yVel, zVel);

        this.maxAge = 40;
        this.setSpriteForAge(spriteProvider);
        this.scale = 3;

    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider){
            this.spriteProvider = spriteProvider;
        }

        @Nullable
        @Override
        public Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new ScissorsSwingParticle(world, x,y,z, this.spriteProvider, velocityX, velocityY, velocityZ);
        }
    }
}
