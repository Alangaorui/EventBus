
package com.alan.eventbus;

import com.alan.eventbus.DummyContent.DummyItem;

import java.util.List;

public class Event {
    /** 列表加载事件 */
    public static class ItemListEvent {
        private List<DummyItem> items;

        public ItemListEvent(List<DummyItem> items) {
            this.items = items;
        }

        public List<DummyItem> getItems() {
            return items;
        }
    }
    
}
