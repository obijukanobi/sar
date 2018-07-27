package org.ac.hackathon.converters;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
public abstract class AbstractConverter<S, T> implements Converter<S, T> {

    public List<T> convert(List<S> listToConvert) {

        List<T> conversions = new ArrayList<>(listToConvert.size());

        for (S toConvert : listToConvert) {
            conversions.add(convert(toConvert));
        }

        return conversions;
    }

}
