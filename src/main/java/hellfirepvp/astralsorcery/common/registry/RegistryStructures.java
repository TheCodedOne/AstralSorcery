/*******************************************************************************
 * HellFirePvP / Astral Sorcery 2017
 *
 * This project is licensed under GNU GENERAL PUBLIC LICENSE Version 3.
 * The source code is available on github: https://github.com/HellFirePvP/AstralSorcery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.astralsorcery.common.registry;

import hellfirepvp.astralsorcery.common.lib.BlocksAS;
import hellfirepvp.astralsorcery.common.registry.multiblock.*;
import hellfirepvp.astralsorcery.common.registry.structures.StructureAncientShrine;
import hellfirepvp.astralsorcery.common.registry.structures.StructureDesertShrine;
import hellfirepvp.astralsorcery.common.registry.structures.StructureSmallShrine;
import hellfirepvp.astralsorcery.common.registry.structures.StructureTreasureShrine;

import static hellfirepvp.astralsorcery.common.lib.MultiBlockArrays.*;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: RegistryStructures
 * Created by HellFirePvP
 * Date: 16.05.2016 / 15:45
 */
public class RegistryStructures {

    public static void init() {
        ancientShrine = new StructureAncientShrine();
        desertShrine = new StructureDesertShrine();
        smallShrine = new StructureSmallShrine();
        treasureShrine = new StructureTreasureShrine();

        patternRitualPedestal = new MultiblockRitualPedestal();
        patternAltarAttunement = new MultiblockAltarAttunement();
        patternAltarConstellation = new MultiblockAltarConstellation();
        patternAltarTrait = new MultiblockAltarTrait();
        patternAttunementFrame = new MultiblockAttunementFrame();
        patternStarlightInfuser = new MultiblockStarlightInfuser();
        patternCollectorRelay = new MultiblockStarlightRelay();
        patternCelestialGateway = new MultiblockGateway();
        patternCollectorEnhancement = new MultiblockCrystalEnhancement();

        patternRitualPedestalWithLink = new MultiblockRitualPedestal();
        patternRitualPedestalWithLink.addBlock(0, 5, 0, BlocksAS.ritualLink.getDefaultState());
    }

}
