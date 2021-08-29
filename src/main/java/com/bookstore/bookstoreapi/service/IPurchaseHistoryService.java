package com.bookstore.bookstoreapi.service;

import com.bookstore.bookstoreapi.model.PurchaseHistory;
import com.bookstore.bookstoreapi.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchaseItemsOfUser(Long userId);
}
