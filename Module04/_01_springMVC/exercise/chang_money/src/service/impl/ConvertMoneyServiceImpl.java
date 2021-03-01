package service.impl;

import org.springframework.stereotype.Service;
import service.IConvertMoneyService;
@Service
public class ConvertMoneyServiceImpl implements IConvertMoneyService {
    @Override
    public Double convert(Double usd) {
        return usd / 23000;
    }
}
