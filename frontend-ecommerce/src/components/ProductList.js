import React, { useEffect, useState } from 'react';
import './ProductList.css';

function ProductList() {
  const [barang, setBarang] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/barang')
      .then((response) => response.json())
      .then((data) => setBarang(data))
      .catch((error) => console.error('Error:', error));
  }, []);

  return (
    <div className="product-container">
      <h2>Elektronik</h2>
      <div className="product-grid">
        {barang.map((item) => (
          <div className="product-card" key={item.id_barang}>
            <img
              src={`https://via.placeholder.com/150?text=${item.nama}`}
              alt={item.nama}
              className="product-image"
            />
            <h3>{item.nama}</h3>
            <p>Stok: {item.stok}</p>
            <p>Harga: Rp {item.harga.toLocaleString()}</p>
          </div>
        ))}
        
      </div>
    </div>
  );
}

export default ProductList;
