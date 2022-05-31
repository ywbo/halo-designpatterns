package com.ilearning.design;

import com.ilearning.design.ceiling.LevelOneCeiling;
import com.ilearning.design.ceiling.LevelTwoCeiling;
import com.ilearning.design.coat.DuluxCoat;
import com.ilearning.design.coat.LiBangCoat;
import com.ilearning.design.floor.ShengXiangFloor;
import com.ilearning.design.tile.DongPengTile;
import com.ilearning.design.tile.MarcoPoloTile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.ilearning.design.enumtype.BuilderTypeEnum.*;

/**
 * 未使用设计模式，实现业务逻辑
 * 装修套餐清单
 *
 * @author yuwenbo
 * @date 2022/6/1 5:25
 **/
public class DecorationPackageController {
    public String getMatterList(BigDecimal area, Integer level) {
        // 装修清单
        List<Matter> list = new ArrayList<>();
        // 装修价格
        BigDecimal price = BigDecimal.ZERO;

        /*
         * 开始组装装修套餐清单
         */

        // 豪华欧式：二级吊顶 + 多乐士 + 圣象
        if (LUXURY_EUROPEAN.getStyleType().equals(level)) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            DuluxCoat duluxCoat = new DuluxCoat();
            ShengXiangFloor shengXiangFloor = new ShengXiangFloor();

            list.add(levelTwoCeiling);
            list.add(duluxCoat);
            list.add(shengXiangFloor);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(duluxCoat.price()));
            price = price.add(area.multiply(shengXiangFloor.price()));

        }

        // 轻奢田园：二级吊顶 + 立邦 + 马可波罗
        if (LIGHT_LUXURY_GARDEN.getStyleType().equals(level)) {
            LevelTwoCeiling levelTwoCeiling = new LevelTwoCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            MarcoPoloTile marcoPoloTile = new MarcoPoloTile();

            list.add(levelTwoCeiling);
            list.add(liBangCoat);
            list.add(marcoPoloTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelTwoCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(marcoPoloTile.price()));
        }

        // 现代简约：一级吊顶 + 立邦 + 东鹏
        if (MODERN_SIMPLIFY.getStyleType().equals(level)) {
            LevelOneCeiling levelOneCeiling = new LevelOneCeiling();
            LiBangCoat liBangCoat = new LiBangCoat();
            DongPengTile dongPengTile = new DongPengTile();

            list.add(levelOneCeiling);
            list.add(liBangCoat);
            list.add(dongPengTile);

            price = price.add(area.multiply(new BigDecimal("0.2")).multiply(levelOneCeiling.price()));
            price = price.add(area.multiply(new BigDecimal("1.4")).multiply(liBangCoat.price()));
            price = price.add(area.multiply(dongPengTile.price()));
        }

        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "装修清单" + "\r\n" +
                "套餐等级：" + level + "\r\n" +
                "套餐价格：" + price.setScale(2, BigDecimal.ROUND_HALF_UP) + " 元\r\n" +
                "房屋面积：" + area.doubleValue() + " 平米\r\n" +
                "材料清单：\r\n");

        for (Matter matter : list) {
            detail.append(matter.scene())
                    .append("：")
                    .append(matter.brand())
                    .append("、")
                    .append(matter.model())
                    .append("、平米价格：")
                    .append(matter.price())
                    .append(" 元。\n");
        }
        return detail.toString();

    }
}
