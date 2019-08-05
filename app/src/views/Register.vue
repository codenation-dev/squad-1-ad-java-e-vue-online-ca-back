<template>
  <div class="container">
    <h1 class="container-title">Cadastro</h1>
    <form class="container-form">
      <Input placeholder="E-mail" type="email"/>
      <Input placeholder="Senha" type="password"/>
      <Button @click="createUser">Enviar</Button>
    </form>
  </div>
</template>

<script>
import Input from "@/components/Input.vue";
import Button from "@/components/Button.vue";

export default {
  name: 'register',
  components: {
    Input,
    Button
  },
  data: () => ({

  }),
  methods: {
    createUser() {
      alert('Chama a rota para criar registrar o usuário');
    }
  }
}
</script>

<style lang="scss" scoped>
  .container {
    display: flex;
    flex-direction: column;
    align-items: center;

    &-title {
      margin: 15rem 1rem 1rem;
    }

    &-form {
      display: flex;
      flex-direction: column;
      width: 100%;

      @media screen and (min-width: 480px) {
        width: 350px;
      }

      & > input {
        margin-bottom: 1rem;
      }
    }
  }
</style>
