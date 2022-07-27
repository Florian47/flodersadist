package main;

import java.util.Collection;

class Player {
    public int healthPoints;
    public Collection<Achievement> allAchievements;
    public Collection<Consumable> items;
    public Collection<Achievement> achievements;

    Player(int healthPoints, Collection<Achievement> allAchievements, Collection<Consumable> items, Collection<Achievement> achievements) {
        this.healthPoints = healthPoints;
        this.allAchievements = allAchievements;
        this.items = items;
        this.achievements = achievements;
    }

    private void consume (Consumable consumable) {
        if(hasConsumable(consumable)) {
            items.remove(consumable);
            if(consumable.getType() == 0) {
                healthPoints += 7;
                if(!hasAchievementsByType(0)) {
                    achievements.add(getAchievementByType(0));
                }
            }
        }
    }

    private Achievement getAchievementByType(int allAchievements) {
        throw new UnimplementedException();
    }

    private boolean hasAchievementsByType(int type){
        throw new UnimplementedException();
    }

    private void takeDamage(int damage) {
        healthPoints -= damage;
        if(healthPoints < 0) {
            if(!hasAchievementsByType(1)) {
                achievements.add(getAchievementByType(1));
            }
        }
    }

    private boolean hasConsumable (Consumable consumable) {
        return items.contains(consumable);
    }



    private class Achievement {
        private int id;
        private int type; // 0 = achieved used potion, 1 = achieved dead
        private boolean achieved;

        public Achievement(int id, int type, boolean achieved) {
            this.id = id;
            this.type = type;
            this.achieved = achieved;
        }
    }

    private class Consumable {
        private int id;
        private int type; //0 = potion, 1 = torch, 2 =

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }
    }
}
