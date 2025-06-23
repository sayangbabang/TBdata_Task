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
    <div className="product-card" key={item.id}>
      <img
        src={item.image_url}
        alt={item.nama}
        className="product-image"
      />
      <h3>{item.nama}</h3>
      <p><strong>Stok:</strong> {item.stok}</p>
      <p><strong>Harga:</strong> Rp {item.harga.toLocaleString()}</p>

      {/* Menampilkan info toko */}
      {item.toko && (
        <div className="toko-info">
          <p><strong>Toko:</strong> {item.toko.nama}</p>
          <p><strong>Alamat:</strong> {item.toko.alamat}</p>
        </div>
      )}
    </div>
  ))}
</div>

    </div>
  );
}

export default ProductList;
