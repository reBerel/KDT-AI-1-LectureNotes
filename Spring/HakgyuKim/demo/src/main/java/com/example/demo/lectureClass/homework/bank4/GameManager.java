package com.example.demo.lectureClass.homework.bank4;

import com.example.demo.lectureClass.homework.bank4.character.Character;
import com.example.demo.lectureClass.homework.bank4.enemy.Enemy;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class GameManager {
    Character character;
    List<Enemy> enemyList = new ArrayList<>();

    public GameManager (String playerEmail, String playerPassword) {
        character = new Character(playerEmail, playerPassword);
    }

    public void addEnemy () {
        final int EnemyCount = 3;

        for(int i = 0; i < EnemyCount; i++) {
            enemyList.add(new Enemy());
        }
    }
}
