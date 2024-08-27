package com.app.rx;

import com.app.rx.subscriber.SubscriberClient;
import rx.Observable;

import java.util.List;

public class ObservableDemo {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.from(List.of(1, 2, 3, 4));
        observable.subscribe(SubscriberClient.getSubscriber());

    }
}
