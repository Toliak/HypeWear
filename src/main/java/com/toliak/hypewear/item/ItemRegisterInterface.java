package com.toliak.hypewear.item;

import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;

public interface ItemRegisterInterface {
    void registerItem(SharedProxy proxy);

    void registerItemModel(ClientProxy proxy);

    void registerItemCustomModel(ClientProxy proxy);
}
