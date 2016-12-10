package com.hanbit2007.calculator.service;

import com.hanbit2007.calculator.domain.CalcDTO;

/**
 * Created by hb2007 on 2016-12-10.
 */

public interface CalcService {
    public abstract int plus(CalcDTO param);
    public int minus(CalcDTO param);
    public int multi(CalcDTO param);
    public int divid(CalcDTO param);
    public int mod(CalcDTO param);
}
