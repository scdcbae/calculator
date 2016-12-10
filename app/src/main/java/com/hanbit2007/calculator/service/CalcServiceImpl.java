package com.hanbit2007.calculator.service;

import com.hanbit2007.calculator.domain.CalcDTO;

/**
 * Created by hb2007 on 2016-12-10.
 */

public class CalcServiceImpl implements CalcService{

    @Override
    public int plus(CalcDTO param) {
        return param.getNum1() + param.getNum2();
    }

    @Override
    public int minus(CalcDTO param) {
        return param.getNum1() - param.getNum2();
    }

    @Override
    public int multi(CalcDTO param) {
        return param.getNum1() * param.getNum2();
    }

    @Override
    public int divid(CalcDTO param) {
        return param.getNum1() / param.getNum2();
    }

    @Override
    public int mod(CalcDTO param) {
        return param.getNum1() % param.getNum2();
    }
}
