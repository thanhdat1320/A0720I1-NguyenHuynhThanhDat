package service.impl;

import org.springframework.stereotype.Service;
import service.IConvertMoneyService;
@Service
public class ConvertMoneyServiceIpml implements IConvertMoneyService {
    @Override
    public Double convert(Double usd) {
        return usd / 23000;
    }
}
