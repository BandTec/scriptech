import React from 'react';
import './styles.css'

import ilustracao from '../../assets/ilustration-svg.png'
import Button from '../../components/button';

function Home() {
    return (

        <div className="container">
            <div className="container-info">
                <h2>
                    Simplify
                </h2>
                <h3>
                    Lidar com documentos nunca foi tão fácil
                </h3>

                <div className="btn-container">
                    <Button />
                    <Button />
                </div>
            </div>
            <div className="container-img">
                <img src={ilustracao} alt="" />
            </div>
        </div>

    )
}

export default Home;