package com.xiangflight.cig;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 8:38 上午
 */

public class PetEnterQueue {

    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCount() {
        return count;
    }

    public String getEnterPetType() {
        return pet.getPetType();
    }
}
