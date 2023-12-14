let Avatars = (props) => {
    const { name, src } = props;
    return (
      <div id="main">
        <img src={src} width="50%" height="50%" />
        <h1>{name}</h1>
      </div>
    );
  };
  
  export default Avatars;