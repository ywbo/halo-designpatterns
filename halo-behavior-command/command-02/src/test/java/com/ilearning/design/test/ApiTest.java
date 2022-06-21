package com.ilearning.design.test;

import com.ilearning.design.XiaoEr;
import com.ilearning.design.cook.impl.GuangDongCook;
import com.ilearning.design.cook.impl.JiangSuCook;
import com.ilearning.design.cook.impl.ShanDongCook;
import com.ilearning.design.cook.impl.SiChuanCook;
import com.ilearning.design.cuisine.ICuisine;
import com.ilearning.design.cuisine.impl.GuangDongCuisine;
import com.ilearning.design.cuisine.impl.JiangSuCuisine;
import com.ilearning.design.cuisine.impl.ShanDongCuisine;
import com.ilearning.design.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 【命令模式】设计模式下业务实现测试类
 *
 * @author yuwenbo
 * @date 2022/6/22 6:59
 **/
public class ApiTest {
    
    @Test
    public void test() {
        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDongCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(guangDoneCuisine);
        xiaoEr.order(jiangSuCuisine);
        xiaoEr.order(shanDongCuisine);
        xiaoEr.order(siChuanCuisine);

        // 下单
        xiaoEr.placeOrder();

    }

    @Test
    public void test_() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Mary", "1243ew");
        map.put("Anna", "fds32");
        map.put("Bom", "dfre23");
        map.put("Jim", "bbnyt");
        map.put("Kary", "ppli");
        System.out.println(map.keySet());

        for (String k : map.keySet()) {
            System.out.println(k.hashCode());
        }

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("A", "1243ew");
        map2.put("B", "fds32");
        map2.put("C", "dfre23");
        map2.put("D", "bbnyt");
        map2.put("E", "ppli");


        System.out.println(map2.keySet());
        for (String k : map2.keySet()) {
            System.out.println(k.hashCode());
        }
    }
}
