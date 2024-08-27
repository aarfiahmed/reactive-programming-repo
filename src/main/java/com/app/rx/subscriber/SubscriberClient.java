package com.app.rx.subscriber;

import rx.Subscriber;

public class SubscriberClient {

    public static Subscriber<Integer> getSubscriber(){
        return new Subscriber<>() {
            public void onCompleted() {
                System.out.println("completed");
            }

            public void onError(Throwable throwable) {
                System.out.println("on Error ");
            }

            public void onNext(Integer o) {
                System.out.println("in onNext "+o);
            }
        };
    }
}
