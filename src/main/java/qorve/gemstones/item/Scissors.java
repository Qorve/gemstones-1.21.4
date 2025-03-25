package qorve.gemstones.item;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.session.report.ReporterEnvironment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerPosition;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.command.SummonCommand;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import qorve.gemstones.Gemstones;
import qorve.gemstones.particles.ModParticles;

public class Scissors extends Item {

    public Scissors(Settings settings) {
        super(settings);
    }
    public static void createParticles(World world, LivingEntity target) {
        Gemstones.LOGGER.info(String.valueOf(world.getDimension()));
        world.addParticle(ModParticles.SCISSORS_SWING_PARTICLE, target.getX(), target.getY(), target.getZ(), 0.0, 0.0, 0.0);
        Gemstones.LOGGER.info("Creating Particles");
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        world.addParticle(ModParticles.SCISSORS_SWING_PARTICLE, user.getX(), user.getY() + 2.0, user.getZ(), 0.0, 0.0, 0.0);
        return ActionResult.SUCCESS;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity player) {
            player.getWorld().addParticle(ModParticles.SCISSORS_SWING_PARTICLE,target.getX(),target.getY(),target.getZ(),0.0,0.0,0.0);
        }
        return super.postHit(stack, target, attacker);
    }
}

