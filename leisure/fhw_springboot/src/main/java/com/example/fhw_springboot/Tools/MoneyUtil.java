package com.example.fhw_springboot.Tools;

import org.apache.commons.math3.util.Pair;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {
    /**
     * 税率
     */
    private final static double taxRate = 0.06;
    /**
     * 小数位精确位数
     */
    private final static int DEF_DIV_SCALE = 9;

    /**
     * BIDDECIMAL精确两位小数
     *
     * @param bigDecimal
     * @return
     */
    public static double transferTwoPoint(BigDecimal bigDecimal) {

        return scaleTwoPoint(bigDecimal).doubleValue();
    }
    public static BigDecimal getTaxRate(){
        return new BigDecimal(MoneyUtil.taxRate*100).setScale(0,BigDecimal.ROUND_HALF_UP);
    }

    /**
     * BIDDECIMAL精确两位小数
     *
     * @param bigDecimal
     * @return
     */
    public static BigDecimal scaleTwoPoint(BigDecimal bigDecimal) {
        BigDecimal resultDecimal = null;
        if (bigDecimal == null) {
            resultDecimal = new BigDecimal("0.00");
        } else {
            resultDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
        return resultDecimal;
    }

    public static double transferTwoPoint(Double price) {
        if (price == null){
            price = 0.0;
        }
        BigDecimal bd = new BigDecimal(price);
        return transferTwoPoint(bd);
    }

    /**
     * 求和
     *
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal sum(Double a, Double b, Double... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : new BigDecimal(Double.toString(a));
        BigDecimal b_v = b == null ? new BigDecimal(0) : new BigDecimal(Double.toString(b));
        BigDecimal sum = a_v.add(b_v);
        if (c != null && c.length > 0) {
            for (Double n : c) {
                sum = sum(sum.doubleValue(), n);
            }
        }
        return sum;
    }

//    /**
//     * 求和
//     *
//     * @param a
//     * @param b
//     * @return
//     */
//    public static BigDecimal sum(BigDecimal a, BigDecimal b, BigDecimal... c) {
//        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
//        BigDecimal b_v = b == null ? new BigDecimal(0) : b;
//        BigDecimal sum = a_v.add(b_v);
//        if (c != null && c.length > 0) {
//            for (BigDecimal n : c) {
//                sum = sum(sum, n);
//            }
//        }
//        return sum;
//    }

//    /**
//     * 求和
//     *
//     * @param a
//     * @param b
//     * @return
//     */
//    public static BigDecimal sum(BigDecimal a, BigDecimal... b) {
//        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
//        BigDecimal sum = a_v;
//        if (b != null && b.length > 0) {
//            for (BigDecimal n : b) {
//                sum = sum(sum, n);
//            }
//        }
//        return sum;
//    }

    /**
     * 求和
     *
     * @param a
     * @param b
     * @return
     */
    public static BigDecimal sum(BigDecimal a, BigDecimal b) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
        BigDecimal b_v = b == null ? new BigDecimal(0) : b;
        BigDecimal sum = a_v.add(b_v);
        return sum;
    }

    /**
     * 求和
     *
     * @param a
     * @return
     */
    public static BigDecimal sum(BigDecimal... a) {
        BigDecimal sum = BigDecimal.ZERO;
        if (a != null && a.length > 0) {
            for (BigDecimal n : a) {
                sum = sum(sum, n);
            }
        }
        return sum;
    }

    /**
     * 求差
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static BigDecimal sub(Double a, Double b, Double... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : new BigDecimal(Double.toString(a));
        BigDecimal b_v = b == null ? new BigDecimal(0) : new BigDecimal(Double.toString(b));
        BigDecimal sub = a_v.subtract(b_v);
        if (c != null && c.length > 0) {
            for (Double n : c) {
                sub = sub(sub.doubleValue(), n);
            }
        }
        return sub;
    }

    /**
     * 求差
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static BigDecimal sub(BigDecimal a, BigDecimal b, BigDecimal... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
        BigDecimal b_v = b == null ? new BigDecimal(0) : b;
        BigDecimal sub = a_v.subtract(b_v);
        if (c != null && c.length > 0) {
            for (BigDecimal n : c) {
                sub = sub(sub, n);
            }
        }
        return sub;
    }

    /**
     * double 乘法
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static BigDecimal mul(Double a, Double b, Double... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : new BigDecimal(Double.toString(a));
        BigDecimal b_v = b == null ? new BigDecimal(0) : new BigDecimal(Double.toString(b));
        BigDecimal mul = a_v.multiply(b_v);
        if (c != null && c.length > 0) {
            for (Double n : c) {
                mul = mul(mul.doubleValue(), n);
            }
        }
        return mul;
    }


    /**
     * BigDecimal 乘法
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static BigDecimal mul(BigDecimal a, BigDecimal b, BigDecimal... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
        BigDecimal b_v = b == null ? new BigDecimal(0) : b;
        BigDecimal mul = a_v.multiply(b_v);
        if (c != null && c.length > 0) {
            for (BigDecimal n : c) {
                mul = mul(mul, n);
            }
        }
        return mul;
    }

    /**
     * double 除法
     *
     * @param scale
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static BigDecimal divide(int scale, Double a, Double b, Double... c) {
        if (b <= 0){
            return new BigDecimal(0);
        }
        BigDecimal a_v = a == null ? new BigDecimal(0) : new BigDecimal(Double.toString(a));
        BigDecimal b_v = b == null ? new BigDecimal(0) : new BigDecimal(Double.toString(b));
        BigDecimal div = a_v.divide(b_v, scale, RoundingMode.HALF_UP);
        if (c != null && c.length > 0) {
            for (Double n : c) {
                div = divide(scale, div.doubleValue(), n);
            }
        }
        return div;
    }

    public static BigDecimal divide(Double a, Double b, Double... c) {
        return divide(DEF_DIV_SCALE, a, b, c);
    }

    public static BigDecimal divide(int scale, BigDecimal a, BigDecimal b, BigDecimal... c) {
        BigDecimal a_v = a == null ? new BigDecimal(0) : a;
        BigDecimal b_v = b == null ? new BigDecimal(0) : b;
        if (b_v.doubleValue() == 0){
            return new BigDecimal(0);
        }
        BigDecimal div = a_v.divide(b_v, scale, RoundingMode.HALF_UP);
        if (c != null && c.length > 0) {
            for (BigDecimal n : c) {
                div = divide(scale, div, n);
            }
        }
        return div;
    }

    public static BigDecimal divide(BigDecimal a, BigDecimal b, BigDecimal... c) {
        return divide(DEF_DIV_SCALE, a, b, c);
    }

    /**
     * 获得小数点后数字个数
     * @param v
     * @return
     */
    public static int numOfDigits(BigDecimal v){
        return  v.subtract(new BigDecimal(v.toBigInteger().toString())).stripTrailingZeros().precision();
    }

    /**
     *
     * @param totalMoney
     * @return
     */
    public static Pair<BigDecimal,BigDecimal> AmountOfCalculation(BigDecimal totalMoney){
        BigDecimal nonTaxMoney = totalMoney.divide(new BigDecimal(taxRate).
                add(BigDecimal.ONE).setScale(2, BigDecimal.ROUND_HALF_UP), 0, BigDecimal.ROUND_HALF_UP);
        BigDecimal taxMoney = totalMoney.subtract(nonTaxMoney);
        return new Pair(nonTaxMoney,taxMoney);
    }

}

