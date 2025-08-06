package kr.co.wikibook.greengram.config.enumcode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//내부적으로 관리하는 공통 코드를 요청을 통해 확인하고 싶을 때 사용
public class EnumMapper {
    private Map<String, List<EnumMapperValue>> factory = new LinkedHashMap<>();

    //e는 EnumMapperValue를 상속받았다면 어떤 타입이든 전달될 수 있음.
    public void put(String key, Class<? extends EnumMapperValue> e) {
        factory.put(key, toEnumValues(e));

    }

    private List<EnumMapperValue> toEnumValues(Class<? extends EnumMapperValue> e) {
        // 특정 enum 타입이 갖고있는 모든 값을 출력시키는 기능은 Class의 getEnumConstants() 메소드를 사용
        e.getEnumConstants();
        return null;
    }
}
