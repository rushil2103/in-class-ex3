CREATE TABLE t_orders (
    id BIGSERIAL NOT NULL,
    order_number VARCHAR(255) DEFAULT NULL,
    sku_code VARCHAR(255),
    price DECIMAL(19,2),
    quantity INT,
    PRIMARY KEY (id)
);

/*private Long id;

    @Column(nullable = false)
    private String roomName;

    @Column(nullable = false)
    private int cVAapacity;

    private boolean acRoom;

    private boolean availability;*/