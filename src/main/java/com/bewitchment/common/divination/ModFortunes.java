package com.bewitchment.common.divination;


import com.bewitchment.api.divination.Fortune;
import com.bewitchment.common.lib.LibMod;

public class ModFortunes {

	private static Fortune zombie;
	private static Fortune silverfish;
	private static Fortune dropBow;

	public static void init() {
		zombie = new FortuneMeetZombie(10, "meet_zombie", LibMod.MOD_ID);
		silverfish = new FortuneMeetUberSilverfish(10, "meet_silverfish", LibMod.MOD_ID);
		dropBow = new FortuneDropBow(7, "drop_bow", LibMod.MOD_ID);
		registerAll();
	}

	public static void registerAll() {
		Fortune.REGISTRY.registerAll(
				zombie,
				silverfish,
				dropBow
		);
	}
}
