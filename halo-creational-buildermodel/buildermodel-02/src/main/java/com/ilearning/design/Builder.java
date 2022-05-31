package com.ilearning.design;

import com.ilearning.design.ceiling.LevelOneCeiling;
import com.ilearning.design.ceiling.LevelTwoCeiling;
import com.ilearning.design.coat.DuluxCoat;
import com.ilearning.design.coat.LiBangCoat;
import com.ilearning.design.floor.ShengXiangFloor;
import com.ilearning.design.tile.DongPengTile;
import com.ilearning.design.tile.MarcoPoloTile;

/**
 * 装修套餐建造器
 *
 * @author yuwenbo
 * @date 2022/6/1 5:50
 **/
public class Builder {
    /**
     * 套餐一：豪华欧式
     * <p>
     * 吊顶：二级吊顶
     * 涂料：多乐士
     * 地板：圣象
     *
     * @param area 面积
     * @return
     */
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new DuluxCoat())
                .appendFloor(new ShengXiangFloor());
    }

    /**
     * 套餐二：轻奢田园
     * <p>
     * 吊顶：二级吊顶
     * 涂料：立邦
     * 地砖：马可波罗
     *
     * @param area 面积
     * @return
     */
    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new MarcoPoloTile());
    }

    /**
     * 套餐三：现代简约
     * <p>
     * 吊顶：一级吊顶
     * 涂料：立邦
     * 地砖：东鹏地砖
     *
     * @param area
     * @return
     */
    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())
                .appendCoat(new LiBangCoat())
                .appendTile(new DongPengTile());
    }


}
