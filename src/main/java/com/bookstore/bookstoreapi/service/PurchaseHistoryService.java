package com.bookstore.bookstoreapi.service;

import com.bookstore.bookstoreapi.model.PurchaseHistory;
import com.bookstore.bookstoreapi.repository.IPurchaseHistoryRepository;
import com.bookstore.bookstoreapi.repository.projection.IPurchaseItem;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseHistoryService implements IPurchaseHistoryService{

    private final IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory){
        purchaseHistory.setPurchaseTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchaseItemsOfUser(Long userId){

        return purchaseHistoryRepository.findAllPurchaseOfUser(userId);
    }
}
