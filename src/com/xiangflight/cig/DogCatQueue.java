package com.xiangflight.cig;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 8:40 上午
 */

public class DogCatQueue {

    private Queue<PetEnterQueue> queueDog;
    private Queue<PetEnterQueue> queueCat;

    private long count;

    public DogCatQueue() {
        queueDog = new LinkedList<>();
        queueCat = new LinkedList<>();
        count = 0;
    }

    public void addPet(Pet pet) {
        switch (pet.getPetType()) {
            case "dog":
                queueDog.add(new PetEnterQueue(pet, count++));
                break;
            case "cat":
                queueCat.add(new PetEnterQueue(pet, count++));
                break;
            default:
                throw new RuntimeException("error, not dog or cat");
        }
    }

    public Pet pollAll() {
        if (isQueueEmpty()) {
            throw new RuntimeException("error, queue is empty");
        }
        if (!isDogQueueEmpty() && !isCatQueueEmpty()) {
            long dogCount = queueDog.peek().getCount();
            long catCount = queueCat.peek().getCount();
            if (dogCount > catCount) {
                return queueCat.poll().getPet();
            } else {
                return queueDog.poll().getPet();
            }
        }
        if (isDogQueueEmpty()) {
            return queueCat.poll().getPet();
        }
        return queueDog.poll().getPet();
    }

    public Dog pollDog() {
        if (isDogQueueEmpty()) {
            throw new RuntimeException("error, dog queue is empty");
        }
        return (Dog) queueDog.poll().getPet();
    }

    public Cat pollCat() {
        if (isCatQueueEmpty()) {
            throw new RuntimeException("error, cat queue is empty");
        }
        return (Cat) queueCat.poll().getPet();
    }

    public boolean isQueueEmpty() {
        return isDogQueueEmpty() && isCatQueueEmpty();
    }

    public boolean isDogQueueEmpty() {
        return queueDog.isEmpty();
    }

    public boolean isCatQueueEmpty() {
        return queueCat.isEmpty();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("dog");
        Cat cat = new Cat("cat");
        DogCatQueue queue = new DogCatQueue();
        queue.addPet(dog);
        queue.addPet(cat);
        Pet pet = queue.pollAll();
        System.out.println(pet.getPetType());
        pet = queue.pollAll();
        System.out.println(pet.getPetType());
    }

}
