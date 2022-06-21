package com.ilearning.design;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.ilearning.design.enumtype.CuisineEnum.*;

/**
 * 【命令模式】非命令模式实现顾客到店点餐，店小二服务顾客并且将菜单给厨师烹饪。
 *
 * @author yuwenbo
 * @date 2022/6/22 6:17
 **/
public class XiaoEr {
    private Logger logger = LoggerFactory.getLogger(XiaoEr.class);

    private Map<Integer, String> cuisineMap = new ConcurrentHashMap<>();

    public void order(int cuisine) {
        if (YUECAI.getCuisine() == cuisine) {
            cuisineMap.put(1, "是中国传统四大菜系、八大菜系之一，以烹制海鲜见长，汤类、素菜、甜菜最具特色。");
        }
        if (SUCAI.getCuisine() == cuisine) {
            cuisineMap.put(2, "是中国传统四大菜系之一，苏菜擅长炖、焖、蒸、炒，重视调汤，保持原汁，风味清鲜，浓而不腻，淡而不薄，酥松脱骨而不失其形，滑嫩爽脆而不失其味。");
        }
        if (LUCAI.getCuisine() == cuisine) {
            cuisineMap.put(3, "是中国传统四大菜系之一，是历史最悠久、技法最丰富、难度最高、最见功力的菜系。");
        }
        if (CHUANCAI.getCuisine() == cuisine) {
            cuisineMap.put(4, "是中国传统四大菜系之一，川菜取材广泛，调味多变，菜式多样，口味清鲜醇浓并重，以善用麻辣调味著称，并以其别具一格的烹调方法和浓郁的地方风味，融会了东南西北各方的特点，博采众家之长，善于吸收，善于创新，享誉中外。");
        }
    }

    public void placeOrder() {
        logger.info(JSON.toJSONString(cuisineMap));
    }
}
