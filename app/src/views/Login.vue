<template>
  <div class="home">
    <h1 class="home-title">Login</h1>
    <v-form @submit.prevent="handleSubmit" v-model="valid" class="home-section">
      <v-text-field required type="email" :rules="emailRules" v-model="email" label="E-mail"></v-text-field>
      <v-text-field
        required
        type="password"
        :rules="passwordRules"
        v-model="password"
        label="Password"
      ></v-text-field>
      <v-btn color="success" :disabled="!valid" type="submit">Logar</v-btn>
    </v-form>
  </div>
</template>

<script>
export default {
  name: 'home',
  data() {
    return {
      email: '',
      emailRules: [
        v => !!v || 'E-mail obrigatório!',
        v => /.+@.+\..+/.test(v) || 'E-mail deve ser válido',
      ],
      password: '',
      passwordRules: [v => !!v || 'Password obrigatório!'],
      valid: true,
    };
  },
  methods: {
    handleSubmit: () => {
      console.log('logando');
    },
  },
};
</script>

<style lang="scss" scoped>
.home {
  height: 100%;
  display: flex;
  align-items: center;
  flex-direction: column;

  &-title {
    margin: 200px 0 0;
  }

  &-section {
    width: 350px;
    display: flex;
    flex-direction: column;
  }
}
</style>
