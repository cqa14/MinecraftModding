package ch.cqa14.modtest.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolTypeMODTEST implements IItemTier {
    LIGHT(9.0F, 1.0F, 3, 0, 10000, null);

    private float attackDamage, efficiency;
    private int harvestLevel, enchentability, maxUse;
    private Item repairMaterial;

    private ToolTypeMODTEST(float attackDamage, float efficiency, int harvestLevel, int enchentability, int maxUse, Item repairMaterial)
    {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.harvestLevel = harvestLevel;
        this.enchentability = enchentability;
        this.maxUse = maxUse;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return this.maxUse;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchentability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }
}
