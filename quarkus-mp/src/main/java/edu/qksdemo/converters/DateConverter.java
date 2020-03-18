package edu.qksdemo.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.microprofile.config.spi.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DateConverter
 */
public class DateConverter implements Converter<Date>{

    private static final Logger LOGGER = LoggerFactory.getLogger( DateConverter.class );
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyy");

    @Override
    public Date convert(String value) {
        Date date = Calendar.getInstance().getTime();
        try {
            date = SDF.parse(value);
        } catch (ParseException e) {
            LOGGER.error("error parsing data {} ", value, e);
        }
        return date;
    }
    
}