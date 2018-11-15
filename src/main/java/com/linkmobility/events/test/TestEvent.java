package com.linkmobility.events.test;

import java.math.BigDecimal;
import java.util.*;
import org.apache.avro.reflect.ReflectData;

/**
 * Test Event
 */
public class TestEvent
{
    /**
     * The id of the event message
     */
    public UUID MessageId;

    /**
     * Correlation id for connecting events
     */
    public String CorrelationId;

    /**
     * Message to recipient
     */
    public String Message;

    /**
     * Returns Avro JSON schema of the event
     */
    public String GetAvroSchema()
    {
        return ReflectData.get().getSchema(TestEvent.class).toString();
    }
}
