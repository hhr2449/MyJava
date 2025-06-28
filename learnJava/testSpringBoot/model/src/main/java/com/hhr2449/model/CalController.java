package com.hhr2449.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;

@Controller
public class CalController {

    /**
     * 贷款计算器
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @param type 0等额本息 1等额本金
     * @return
     */
    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(double p, int m, double yr, int type) {
        //使用数组作为返回值，同时返回还款总额和利息
        if(type == 0) {
            return cal0(p, m, yr);
        }
        else {
            return cal1(p, m, yr);
        }

    }

    /**
     * 等额本金
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @return
     */
    private static String[] cal1(double p, int m, double yr) {
        double mr = yr /12 /100;
        double payPrinciple = p / m;
        double payInterest = 0;
        for(int i = 0; i < m; i++) {
            payInterest += p * mr;
            p -= payPrinciple;
        }
        return new String[]{NumberFormat.getCurrencyInstance().format(payPrinciple * m + payInterest),
                NumberFormat.getCurrencyInstance().format(payInterest)};
    }

    /**
     * 等额本息
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @return
     */
    private static String[] cal0(double p, int m, double yr) {
        double mr = yr / 12 / 100;
        double payment = p * mr * Math.pow(1 + mr, m) / (Math.pow(1 + mr, m) - 1);
        double payInterest = payment * m - p;
        return new String[]{NumberFormat.getCurrencyInstance().format(payment * m),
                NumberFormat.getCurrencyInstance().format(payInterest)};
    }

    /**
     * 计算详情
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @param type 0等额本息 1等额本金
     * @return
     */
    @RequestMapping("/details")
    @ResponseBody
    String[][] details(double p, int m, double yr, int type) {

        if (type == 0) {
            return details0(p, m, yr);
        } else {
            return details1(p, m, yr);
        }
    }

    /**
     * 等额本金
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @return
     */
    private static String[][] details1(double p, int m, double yr) {
        String[][] details = new String[m][5];
        double mr = yr / 12 / 100;
        double payPrinciple = p / m;
        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            p -= payPrinciple;
            details[i][0] = String.valueOf(i + 1);
            details[i][1] = NumberFormat.getCurrencyInstance().format(payPrinciple + payInterest);
            details[i][2] = NumberFormat.getCurrencyInstance().format(payPrinciple);
            details[i][3] = NumberFormat.getCurrencyInstance().format(payInterest);
            details[i][4] = NumberFormat.getCurrencyInstance().format(p);
        }
        return details;
    }

    /**
     * 等额本息
     * @param p 金额
     * @param m 月数
     * @param yr 年利率
     * @return
     */
    private static String[][] details0(double p, int m, double yr) {
        String[][] details = new String[m][5];
        double mr = yr / 12 / 100;
        double payment = p * mr * Math.pow(1 + mr, m) / (Math.pow(1 + mr, m) - 1);
        for (int i = 0; i < m; i++) {
            double payInterest = p * mr;
            double payPrincipal = payment - payInterest;
            details[i][0] = String.valueOf(i + 1);
            details[i][1] = NumberFormat.getCurrencyInstance().format(payment);
            details[i][2] = NumberFormat.getCurrencyInstance().format(payPrincipal);
            details[i][3] = NumberFormat.getCurrencyInstance().format(payInterest);
            p -= payPrincipal;
            details[i][4] = NumberFormat.getCurrencyInstance().format(p);
        }
        return details;
    }
}
