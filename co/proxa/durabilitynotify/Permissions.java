package co.proxa.durabilitynotify;

import org.bukkit.entity.Player;
import co.proxa.durabilitynotify.file.Paths;

public class Permissions {


    private static DurabilityNotify dn;


    public Permissions(DurabilityNotify dn) {
        this.dn = dn;
    }

    public static boolean hasToolPerms(Player player) {
        return player.hasPermission("dura.tools") || player.hasPermission("dura.*")
                || dn.getConfig().getBoolean(Paths.useOP) && player.isOp();
    }

    public static boolean hasArmorPerms(Player player) {
        return player.hasPermission("dura.armor") || player.hasPermission("dura.*")
                || dn.getConfig().getBoolean(Paths.useOP) && player.isOp();
    }
}