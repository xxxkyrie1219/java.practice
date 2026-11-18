package com.zuojinhai.literal;

public class VariableDemo2 {
    public static void main(String[] args) {
        /*
              我方：叉子           对方：长矛
              攻击：220            攻击：210
              防御：85             防御：80
              血量：1012.5         血量：1223.3
              技能加成：1.2         技能加成：1.3
              技能造成伤害的公式：攻击力*技能加成-对方防御力
              普攻造成伤害的公式：攻击力-对方防御力

              计算：
              我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
              我方进行第二次技能攻击，造成多少伤害，对方还剩余多少血量？

          规则：经常发生变动的数据，用变量记录
         */
        //1.定义变量记录我方攻击力
        int myAttack = 220;
        //2.定义变量记录对方防御力
        int enemyDefense = 85;
        //3.定义变量记录对方血量
        double enemyBlood = 1012.5;
        //4.定义变量记录技能加成
        double skillAdd = 1.2;
        //5.定义变量记录我方第一次普通攻击造成伤害
        double myAttackDamage = myAttack - enemyDefense;
        //6.定义变量记录我方第二次技能攻击造成伤害
        double mySkillDamage = myAttack * skillAdd - enemyDefense;
        //7.定义变量记录对方剩余血量
        double enemyRemainingBlood = enemyBlood - myAttackDamage - mySkillDamage;
        //8.输出结果
        System.out.println("我方第一次普通攻击造成伤害：" + myAttackDamage);
        System.out.println("我方第二次技能攻击造成伤害：" + mySkillDamage);
        System.out.println("对方剩余血量：" + enemyRemainingBlood);
    }
}
