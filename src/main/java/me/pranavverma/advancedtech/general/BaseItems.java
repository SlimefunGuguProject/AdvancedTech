package me.pranavverma.advancedtech.general;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;



@UtilityClass
public final class BaseItems {

    public static int advanced_solar_gen_power_day = 2056;
    public static int advanced_solar_gen_power_night = 1080;
    
    public static final SlimefunItemStack command_engine_ = new SlimefunItemStack("COMMAND_HUB_ENGINE", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2NmMTZiYmZlYzZlMGU1YTU4YTk5YjEwYzUyYWNkMDgzZTJhYzg2ZTAwMTNlMDM3ZDZmOTA2MjQzYjYzYTI3OSJ9fX0=")), "&c控制中枢引擎", "" + "&r&l源自控制中枢的引擎", LoreBuilder.radioactive(Radioactivity.MODERATE), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack command_hub_ = new SlimefunItemStack("COMMAND_HUB", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWM4ZjA4MzljMmRiNDlmZGI1ZmM0NTUxNmY3ZTBlMWY2MzE1MTY4OGEwMjY3ZDBkZmQxM2Y4MTYyMWU2ZDU0NCJ9fX0=")), "&e控制中枢", "" + "&r&l&c主要中央指挥中枢", LoreBuilder.radioactive(Radioactivity.LOW));
    public static final SlimefunItemStack boosted_carbonado_ = new SlimefunItemStack("BOOSTED_CARBONADO", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDU4ZjFhNzJlYjUyYzdkNjgxZjc5NTk5YzNiZjdlYTkxMmY4YzhhZmM4ZWU5NTRiZTMzZWFhNmJiNGNlNGZiIn19fQ==")), "&d大型黑金刚石","" + "&r&l黑金刚石 V2.0");
    public static final SlimefunItemStack framed_uranium_ = new SlimefunItemStack("FRAMED_URANIUM", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTBjMGM5Nzg5ZGNmYTk5ZDZjMDRiOTE2MTc3MTEwYjNmOWEwNzdjOTY0ZTVjYTBhMGJmODZkNTdkYmU1OTNiYSJ9fX0=")), "&d铀框架","" + "&r&l一种超过负荷的铀", LoreBuilder.radioactive(Radioactivity.VERY_DEADLY), LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack fire_cake = new SlimefunItemStack("FIRE_CAKE", Material.CAKE, "&a火焰蛋糕", "&c你最好小心一点!", LoreBuilder.radioactive(Radioactivity.HIGH));
    public static final SlimefunItemStack handheld_digger_1_ = new SlimefunItemStack("HANDHELD_DIGGER_1", Material.NETHERITE_PICKAXE, "&4基础手持爆炸镐", "&c允许你挖掘4 x 4的地方");
    public static final SlimefunItemStack handheld_digger_2_ = new SlimefunItemStack("HANDHELD_DIGGER_2", Material.NETHERITE_PICKAXE, "&e高级手持爆炸镐", "&c允许你挖掘5 x 5的地方");
    public static final SlimefunItemStack handheld_digger_3_ = new SlimefunItemStack("HANDHELD_DIGGER_3", Material.NETHERITE_PICKAXE, "&d黑金刚石手持爆炸镐", "&c允许你挖掘7 x 7的地方");

    public static final SlimefunItemStack advanced_solar_gen = new SlimefunItemStack("ADVANCED_SOLAR_GEN", PlayerHead.getItemStack(PlayerSkin.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZkZDllNTg4ZDI0NjFkMmQzZDA1OGNiM2UwYWYyYjNhMzM2NzYwN2FhMTRkMTI0ZWQ5MmE4MzNmMjVmYjExMiJ9fX0=")), "&a高级太阳能发电机", "&c高级机器基础", "&b需要通过指挥中枢连接！", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(advanced_solar_gen_power_day * 2));
}
