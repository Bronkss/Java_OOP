package Lesson2.Seminar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueMarket, MarketBehavoir{
    List<Actor> actorList = new ArrayList<>();
    Queue<QueueMarket> queueMarkets = new LinkedList<>();

}
